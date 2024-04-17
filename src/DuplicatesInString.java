public class DuplicatesInString {
    public static void main(String[] args){
        String string = "How many duplicates are here?";
        StringBuilder charecters = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            String current = Character.toString(string.charAt(i));
            if(charecters.toString().contains(current)){
                if(!duplicates.toString().contains(current)){
                    duplicates.append(current).append(",");
                }
            }
            charecters.append(current);
        }
        System.out.println(duplicates);
    }
}
