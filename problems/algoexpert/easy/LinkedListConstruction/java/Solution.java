
public class Solution {

    public static void main(final String... arg) {

    }

    static class DoublyLinkedList {

        public Node head;

        public Node tail;

        public void setHead(Node node) {
            if (this.head == null) {
                this.head = node;
                this.tail = node;
                return;
            }
            insertBefore(this.head, node);
        }

        public void setTail(Node node) {
            if (this.tail = null) {
                setHead(node);
                return;
            }
            insertAfter(this.tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == this.head || nodeToInsert == this.tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev != null) {
                node.prev.next = nodeToInsert;
            } else {
                head = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == this.head || nodeToInsert == this.tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next != null) {
                node.next.prev = nodeToInsert;
            } else {
                tail = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) setHead(nodeToInsert);
            
            Node temp = this.head;
            int cont = 1;

            while (temp != null && cont++ != position) temp = temp.next;

            if (temp == null) {
                setTail(temp);
            } else {
                insertBefore(temp, nodeToInsert);
            }

        }

        public void remove(Node node) {
            if (node == this.head) this.head = this.head.next;
            if (node == this.tail) this.tail = this.tail.prev;
            remove(node);
        }

        public void removeBindings(Node node) {
            if (node.next != null) node.next.prev = node.prev;
            if (node.prev != null) node.prev.next = node.next;
            node.next = null;
            node.prev = null;
        }

    }

    static class Node {

        public int val;

        public Node prev;

        public Node next;

        public Node(int val) {
            this.val = val;
        }

    }

}
