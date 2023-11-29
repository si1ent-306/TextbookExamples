public class DuplicatesInString {
    public static void main(String[] args){
        String string = "How many duplicates are here?";
        String charecters = "";
        String duplicates = "";

        for(int i = 0; i < string.length(); i++){
            String current = Character.toString(string.charAt(i));
            if(charecters.contains(current)){
                if(!duplicates.contains(current)){
                    duplicates += current + ",";
                }
            }
            charecters += current;
        }
        System.out.println(duplicates);
    }
}
