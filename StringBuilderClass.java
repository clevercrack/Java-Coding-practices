class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Drako");
        System.out.println(str);

        // char at index 0
        System.out.println(str.charAt(0));

        // set char at index 0
        str.setCharAt(0, 'v');
        System.out.println(str);

        // insert at any index using insert() function
        str.insert(1, 'Y');
        System.out.println(str);

        // delete at any index using delete() function
        str.delete(1, 2);
        System.out.println(str);

        // to add in the end of any string using append() function
        str.append(" HARRY POTTER");
        System.out.println(str);
    }
}