import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Huffman {
//    important declarations:-
    static final boolean newTextBasedOnOldOne = false;
    static String text = "";
    static String encoded = "";
    static String decoded = "";
    static int ASCII[] = new int[128];
    static PriorityQueue<Node> nodes = new PriorityQueue<>((o1, o2) -> (o1.value < o2.value) ? -1 : 1);
    static TreeMap<Character, String> codes = new TreeMap<>();

//    methods:-
    public static boolean isSameCharacterSet() {
        boolean flag = true;
        for (int i=0; i<text.length(); i++) {
            if (ASCII[text.charAt(i)] == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    private static void decodeText() {
        decoded = "";
        Node node = nodes.peek();
        for (int i = 0; i < encoded.length(); ) {
            Node tmpNode = node;
            while (tmpNode.left != null && tmpNode.right != null && i < encoded.length()) {
                if (encoded.charAt(i) == '1')
                    tmpNode = tmpNode.right;
                else tmpNode = tmpNode.left;
                i++;
            }
            if (tmpNode != null)
                if (tmpNode.character.length() == 1)
                    decoded += tmpNode.character;
                else
                    System.out.println("Input not Valid");

        }
        System.out.println("Decoded Text: " + decoded);
    }

    private static void handleDecodingNewText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to decode:");
        encoded = sc.nextLine();
        System.out.println("Text to Decode: " + encoded);
        decodeText();
    }

    private static void encodeText() {
        encoded = "";
        for (int i = 0; i < text.length(); i++)
            encoded += codes.get(text.charAt(i));
        System.out.println("Encoded Text: " + encoded);
    }

    private static boolean handleEncodingNewText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to encode:");
//        sc.nextLine();
        text = sc.nextLine();
        System.out.println("Text to Encode: " + text);

        if (!isSameCharacterSet()) {
            System.out.println("Not Valid input");
            text = "";
            return true;
        }
        encodeText();
        return false;
    }

    private static void buildTree(PriorityQueue<Node> vector) {
        while (vector.size() > 1)
            vector.add(new Node(vector.poll(), vector.poll()));
    }

    private static void calculateCharIntervals(PriorityQueue<Node> vector, boolean printIntervals) {
        if (printIntervals) System.out.println("-- intervals --");

        for (int i = 0; i < text.length(); i++)
            ASCII[text.charAt(i)]++;

        for (int i = 0; i < ASCII.length; i++)
            if (ASCII[i] > 0) {
                vector.add(new Node(ASCII[i] / (text.length() * 1.0), ((char) i) + ""));
                if (printIntervals)
                    System.out.println("'" + ((char) i) + "' : " + ASCII[i] / (text.length() * 1.0));
            }
    }

    private static void generateCodes(Node node, String s) {
        if (node != null) {
            if (node.right != null)
                generateCodes(node.right, s + "1");

            if (node.left != null)
                generateCodes(node.left, s + "0");

            if (node.left == null && node.right == null)
                codes.put(node.character.charAt(0), s);
        }
    }

    private static void printCodes() {
        System.out.println("--- Printing Codes ---");
        codes.forEach((k, v) -> System.out.println("'" + k + "' : " + v));
    }

    public static boolean handleNewText() {
        Scanner sc = new Scanner(System.in);
        Design dgn = new Design();
        int oldTextLength = text.length();
        dgn.appender1();
        System.out.print("Enter the text: ");
        text = sc.nextLine();
        if (newTextBasedOnOldOne && (oldTextLength != 0 && !isSameCharacterSet())) {
            dgn.appender1();
            System.out.println("Not Valid Input");
            text = "";
            return true;
        }

        ASCII = new int[128];
        nodes.clear();
        codes.clear();
        encoded = "";
        decoded = "";
        System.out.println("Text: " + text);
        calculateCharIntervals(nodes, true);
        buildTree(nodes);
        generateCodes(nodes.peek(), "");

        printCodes();
        System.out.println("-- Encoding/Decoding --");
        encodeText();
        decodeText();
        return false;
    }

    public static int consoleMenu(Scanner sc) {
        Design dgn = new Design();
        int decision;
        dgn.appender1();
        System.out.println("---- Menu ----");
        dgn.appender1();
        System.out.println("-- [-1] to exit");
        dgn.appender1();
        System.out.println("-- [1] to enter new text");
        dgn.appender1();
        System.out.println("-- [2] to encode a text");
        dgn.appender1();
        System.out.println("-- [3] to decode a text");
        dgn.appender1();
        System.out.print("Enter your choice: ");
        decision = Integer.parseInt(sc.nextLine());
        return decision;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Design dgn = new Design();
        dgn.printStars();
        dgn.appender1();
        System.out.println("-----:Java Program to find HUFFMAN CODE of input characters:-----");

        int decision = 1;
        while (decision != -1) {
            switch (decision) {
                case 1:
                    handleNewText();
                    break;

                case 2:
                    handleEncodingNewText();
                    break;

                case 3:
                    handleDecodingNewText();
                    break;

                default:
                    dgn.appender2();
                    System.out.println("---INVALID INPUT---");
            }
            decision = consoleMenu(sc);
        }
        dgn.appender1();
        System.out.println("Exiting...");
        dgn.printStars();
    }
}
