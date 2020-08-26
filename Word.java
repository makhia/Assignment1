public class Word{
    
    private String num;
    private String word;
    private String definition;
    
    
    
    public Word(String integer, String true_word, String word_meaning){
        num = integer;
        word = true_word;
        definition = word_meaning;
//         String[] array = data.split(",");
//         num = array[0];
//         word = array[1];
//         definition = array[2];
    }
    
    public String toString(){
        return String.format("%s : %s- %s",num, word, definition);
    }
    public String getNum(){
        return num;
    }
    
    public void setNum(String number){
        num = number;
        
    }
    public String getWord(){
        return word;
    }
    
    public void setWord(String words){
        word = words;
    }
    
    public String getDefinition(){
        return definition;
    }
    
    public void setDefinition(String meaning){
        definition = meaning;
    }
    
    
    
    
    
    
    
    
    
    
    
}