class CheckLetter {
    public static void main(String[] args) {
        String word = "Umbrella";
        
        if(word.toLowerCase().contains("e")) {
            System.out.println("Letter 'e' is present in Umbrella.");
        } else {
            System.out.println("Letter 'e' is not present in Umbrella.");
        }
    }
}
