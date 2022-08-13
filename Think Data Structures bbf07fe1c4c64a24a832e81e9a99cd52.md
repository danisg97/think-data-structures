# Think Data Structures

Thoughts on the *Think Data Structures* book.

[Think Data Structures: Algorithms and Information Retrieval in Java](https://www.amazon.es/Think-Data-Structures-Allen-Downey/dp/1491972394/ref=sr_1_12?gclid=Cj0KCQjwl92XBhC7ARIsAHLl9akMN0G_J9RVnuVIUYPW4lFJHW9njidVjSAtC9ID_Xhci3mv6iegSK8aAmIAEALw_wcB&keywords=algorithms+data+structures&qid=1660381446&sr=8-12)

## List Interface

*Array List, Linked List & Doubly Linked List.*

Performance expected for different implementations of the List Interface:

1 → *O(1)* → Constant time.

n → *O(n)* → Linear time.

|  | Array List | Linked List | Doubly Linked List |
| --- | --- | --- | --- |
| add (at the end) | 1 | n | 1 |
| add (at the beginning) | n | 1 | 1 |
| add (in general) | n | n | n |
| get / set | 1 | n | n |
| indexOf / lastIndexOf | n | n | n |
| isEmpty / size | 1 | 1 | 1 |
| remove (from the end) | 1 | n | 1 |
| remove (from the beginning) | n | 1 | 1 |
| remove (in general) | n | n | n |

---

## Tree Transversal

[Tree traversal - Wikipedia](https://en.wikipedia.org/wiki/Tree_traversal)

[Tree traversal - Wikipedia](https://en.wikipedia.org/wiki/Tree_traversal#Depth-first_search)

### DFS o Depth First Search

[Búsqueda en profundidad - Wikipedia, la enciclopedia libre](https://es.wikipedia.org/wiki/B%C3%BAsqueda_en_profundidad)

*“DFS starts at the root of the tree and selects the first child. If the child has children, it selects the first child again. When it gets to a node with no childern, it **backtraks**. moving up the tree to the parent node, where it selects the next child if there is one; otherwhise it **backtracks** again.*

*When it has explored the last child of the root, it’s done”.*

[Vuelta atrás - Wikipedia, la enciclopedia libre](https://es.wikipedia.org/wiki/Vuelta_atr%C3%A1s)

```java
private static void recursiveDFS (Node node) {
	if (node instanceof TextNode) {
		System.out.print(node);	
	}
	for (Node child : node.childNodes()) {
		recursiveDFS(child);
	}
}
```

```java
private static void iterativeDFS (Node root) {
	Deque<Node> stack = new ArrayDeque<Node>();
	stack.push(root);

	while (!stack.isEmpty()) {
		Node node = stack.pop();
		if (node instanceof TextNode) {
			System.out.print(node);
		}
		List<Node> nodes = new ArrayList<Node>(node.childNodes());
		Collection.reverse(nodes);

		for (Node child : nodes) {
			stack.push(child);
		}
	}
}
```