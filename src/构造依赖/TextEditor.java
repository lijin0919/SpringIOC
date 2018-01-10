package 构造依赖;

public class TextEditor {
    private SpellChecker spellChecker;
    private ImageChecker imageChecker;
    public TextEditor(SpellChecker spellChecker,ImageChecker imageChecker) {
        System.out.println("文本编辑器构造" );
        this.spellChecker = spellChecker;
        this.imageChecker = imageChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void image(){
        imageChecker.hua();
    }
}
