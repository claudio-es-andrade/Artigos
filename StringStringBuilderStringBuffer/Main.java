//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuffer a1 = new StringBuffer("ABC");
        StringBuffer b2 = new StringBuffer("ABC");

        if (a1 == b2)
            System.out.println("As STRINGSBUFFERS são iguais (COMPARAÇÃO ==)");
        else
            System.out.println("As STRINGSBUFFERS são diferentes (COMPARAÇÃO ==)");

        System.out.println("As STRINGSBUFFER são iguais? (Método EQUALS):" + a1.equals(b2));

        String c1 = "ABC";
        String d2 = "ABC";

        if (c1 == d2)
            System.out.println("As STRINGS são iguais (COMPARAÇÃO ==)");
        else
            System.out.println("As STRINGS são diferentes (COMPARAÇÃO ==)");
        System.out.println("As STRINGS são iguais? (Método EQUALS):" + c1.equals(d2));

        String c01 = new String("ABC");
        String d02 = new String("ABC");

        if (c01 == d02)
            System.out.println("As STRINGS são iguais (COMPARAÇÃO ==)");
        else
            System.out.println("As STRINGS são diferentes (COMPARAÇÃO ==)");
        System.out.println("As STRINGS são iguais? (Método EQUALS):" + c01.equals(d02));

        String c001 = "ABC";
        String d002 = new String("ABC");

        if (c001 == d002)
            System.out.println("As STRINGS são iguais (COMPARAÇÃO ==)");
        else
            System.out.println("As STRINGS são diferentes (COMPARAÇÃO ==)");
        System.out.println("As STRINGS são iguais? (Método EQUALS):" + c001.equals(d002));

        StringBuilder e1 = new StringBuilder("ABC");
        StringBuilder f2 = new StringBuilder("ABC");

        if (e1 == f2)
            System.out.println("As STRINGSBUILDER são iguais (COMPARAÇÃO ==)");
        else
            System.out.println("As STRINGSBUILDER são diferentes (COMPARAÇÃO ==)");

        System.out.println("As STRINGSBUILDER são iguais? (Método EQUALS):" + e1.equals(f2));

    }
}