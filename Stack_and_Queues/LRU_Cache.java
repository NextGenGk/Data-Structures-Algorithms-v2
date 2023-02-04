package Stack_and_Queues;

import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {

    class LRUCache {
        // create head and tail Node
        // & initialize with 0
        Node head = new Node(0, 0);
        Node tail = new Node(0, 0);
        // create map
        Map<Integer, Node> map = new HashMap<>();
        int capacity;

        // size of cache
        public LRUCache(int _capacity) {
            capacity = _capacity;
            head.next = tail;
            tail.prev = head;
        }

        // get() function
        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                insert(node);
                return node.value;
            } else {
                return -1;
            }
        }

        // put() function
        public void put(int key, int value) {
            if (map.containsKey(key)) {
                remove(map.get(key));
            }
            if (map.size() == capacity) {
                remove(tail.prev);
            }
            insert(new Node(key, value));
        }

        // remove() function
        private void remove(Node node) {
            map.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        // insert() function
        private void insert(Node node) {
            map.put(node.key, node);
            Node headNext = head.next;
            head.next = node;
            node.prev = head;
            headNext.prev = node;
            node.next = headNext;
        }

        // Node Class
        class Node {
            Node prev, next;
            int key, value;

            Node(int _key, int _value) {
                key = _key;
                value = _value;
            }
        }
    }
}

// Output -
/*
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
 */

// Time & Space Complexity -
/*
Time -
get() - O(1)
put() - O(1)
*/

// Algorithm -
/*
1. We create a doubly linked list with a dummy head and tail.
2. We create a HashMap to store the key-value pairs.
3. We use the get() method to get the value of a key. If the key exists, we remove the node from the linked list and
insert it at the head of the linked list.
4. We use the put() method to insert a key-value pair. If the key already exists, we remove the node from the
linked list and insert it at the head of the linked list. If the key doesn’t exist,
we insert the key-value pair at the head of the linked list. If the size of the linked list exceeds the capacity,
we remove the tail node from the linked list.
5. We use the remove() method to remove a node from the linked list.
6. We use the insert() method to insert a node at the head of the linked list.
*/