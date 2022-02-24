package com.javarush.task.task32.task3209.actions;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.ActionEvent;

public class SubscriptAction extends StyledEditorKit.StyledTextAction {

    public SubscriptAction(String nm) {
        super(nm);
    }

    public SubscriptAction() {
        this(StyleConstants.Subscript.toString());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JEditorPane jEditorPane = getEditor(actionEvent);
        if (jEditorPane != null) {
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(jEditorPane).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setSubscript(simpleAttributeSet, !StyleConstants.isSubscript(mutableAttributeSet));
            setCharacterAttributes(jEditorPane, simpleAttributeSet, false);

        }

    }

}
