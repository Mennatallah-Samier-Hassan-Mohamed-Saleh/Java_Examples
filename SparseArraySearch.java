public class SparseArraySearch {
    public static void main(String args[]) {
        String[] concepts = new String[5];
        concepts[0] = "abstraction";
        concepts[2] = "polymorphism";
        concepts[3] = "inheritance";
        concepts[4] = "encapsulation";

        String result = "not found";

        for (String concept : concepts ) {
            System.out.println(concept);
            /*
            if (concept.equals("polymorphism") ) {
                result = "found";
                break;
            }
            */
        }
        System.out.println(result);
    }
}
