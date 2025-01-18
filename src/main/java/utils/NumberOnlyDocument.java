// src/main/java/utils/NumberOnlyDocument.java

package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class NumberOnlyDocument extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) {
            return;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return;
            }
        }
        super.insertString(offs, str, a);
    }
}