package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;
import com.javarush.task.task32.task3209.listeners.UndoListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();//панель с двумя вкладками
    private JTextPane htmlTextPane = new JTextPane();//визуальное редактирование
    private JEditorPane plainTextPane = new JEditorPane();//редактирование html текста(отобр.код html)
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);


    public View() {
        try {
            UIManager.setLookAndFeel(this.getName());

        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        switch (command) {
            case "Новый":
                controller.createNewDocument();
                break;
            case "Открыть":
                controller.openDocument();
                break;
            case "Сохранить":
                controller.saveDocument();
                break;
            case "Сохранить как...":
                controller.saveDocumentAs();
                break;
            case "Выход":
                controller.exit();
                break;
            case "О программе":
                showAbout();
                break;
        }
    }

    public void init() {//представление
        initGui();
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);//добав слушателя
        setVisible(true);//показывать диал.окно


    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {//инициал.меню
        JMenuBar jMenuBar = new JMenuBar();//панель меню
        MenuHelper.initFileMenu(this, jMenuBar);//файл
        MenuHelper.initEditMenu(this, jMenuBar);//редакт
        MenuHelper.initStyleMenu(this, jMenuBar);//стиль
        MenuHelper.initAlignMenu(this, jMenuBar);//выравнивание
        MenuHelper.initColorMenu(this, jMenuBar);//цвет
        MenuHelper.initFontMenu(this, jMenuBar);//шрифт
        MenuHelper.initHelpMenu(this, jMenuBar);//помощь
        getContentPane().add(jMenuBar, BorderLayout.NORTH);

    }

    public void initEditor() {//инициал.панель редакт
        htmlTextPane.setContentType("text/html");
        JScrollPane jScrollPaneHTML = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", jScrollPaneHTML);//добав.вкладку
        JScrollPane jScrollPanePLAN = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", jScrollPanePLAN);
        tabbedPane.setPreferredSize(new Dimension(900, 500));//предпочт размер окна
        TabbedPaneChangeListener tabbed = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(tabbed);//устана.слушателя изменений
        getContentPane().add(tabbedPane, BorderLayout.CENTER);//получаю панель контента тек.фрейма
    }

    public void initGui() {//иниц.граф.интерф
        initMenuBar();
        initEditor();
        pack();//автомат.устанавливает размер диалог.окна в зависимости от кол-ва окон
    }

    public void selectedTabChanged() {//когда произошла смена выбранной вкладки
        if (tabbedPane.getSelectedIndex() == 0) {//Текст
            controller.setPlainText(plainTextPane.getText());
        } else {
            plainTextPane.setText(controller.getPlainText());
        }
        resetUndo();

    }

    public boolean canUndo() {
        return undoManager.canUndo();
    }

    public UndoListener getUndoListener() {
        return undoListener;
    }

    public boolean canRedo() {
        return undoManager.canRedo();
    }

    public void undo() {//отмена действия
        try {
            undoManager.undo();
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public void redo() {//возврат отмененного действия
        try {
            undoManager.redo();
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public void resetUndo() {//отмена всех изменений
        undoManager.discardAllEdits();
    }

    public boolean isHtmlTabSelected() {
        return tabbedPane.getSelectedIndex() == 0;//если выбрана html вкладка то вернет true
    }

    public void selectHtmlTab() {
        tabbedPane.setSelectedIndex(0);
        resetUndo();

    }

    public void update() {
        htmlTextPane.setDocument(controller.getDocument());
    }

    public void showAbout() {
        JOptionPane.showMessageDialog(plainTextPane, "программа написана 2021г разработчиком turaldinio \n © все права защищены", "о производителе", JOptionPane.INFORMATION_MESSAGE);
    }
}
