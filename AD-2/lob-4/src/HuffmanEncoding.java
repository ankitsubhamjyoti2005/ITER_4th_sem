//import java.lang.reflect.Array;
import java.util.Arrays;


import java.util.PriorityQueue;
import java.util.HashMap;

    class HuffmanNode implements Comparable<HuffmanNode> {
        char data;
        int frequency;
        HuffmanNode left, right;

        public HuffmanNode(char data, int frequency) {
            this.data = data;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(HuffmanNode node) {
            return this.frequency - node.frequency;
        }
    }

    public class HuffmanEncoding {

        public static void main(String[] args) {
            String text = "hello world";
            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : text.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
            for (char c : frequencyMap.keySet()) {
                pq.add(new HuffmanNode(c, frequencyMap.get(c)));
            }

            while (pq.size() > 1) {
                HuffmanNode left = pq.poll();
                HuffmanNode right = pq.poll();

                HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
                newNode.left = left;
                newNode.right = right;

                pq.add(newNode);
akjdsfkgvsz
            HuffmanNode root = pq.peek();

            HashMap<Character, String> huffmanCodeMap = new HashMap<>();
            generateCode(root, "", huffmanCodeMap);

            for (char c : huffmanCodeMap.keySet()) {
                System.out.println(c + " : " + huffmanCodeMap.get(c));
            }
        }

        private static void generateCode(HuffmanNode node, String code, HashMap<Character, String> huffmanCodeMap) {
            if (node == null) {
                return;
            }

            if (node.data != '\0') {
                huffmanCodeMap.put(node.data, code);
            }

            generateCode(node.left, code + "0", huffmanCodeMap);
            generateCode(node.right, code + "1", huffmanCodeMap);
        }
    }

