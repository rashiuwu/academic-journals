class Programming {
    
    Programming(String language) {
        System.out.println("I love " + language);
    }
    Programming() {
        System.out.println("I love Java");
    }


    public static void main(String[] ar) {
        Programming p1 = new Programming("Python");
        Programming p2 = new Programming();
    }
}
