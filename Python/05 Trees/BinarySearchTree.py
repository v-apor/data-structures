class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self):
        self.root = None

    def insert(self, value):
        new_node = Node(value)
        if self.root is None:
            self.root = new_node
            return True
        current = self.root
        while True:
            if value == current.value:
                return False
            if value < current.value:
                if current.left is None:
                    current.left = new_node
                    return True
                current = current.left
            else:
                if current.right is None:
                    current.right = new_node
                    return True
                current = current.right

    def contains(self, value):
        current = self.root
        while current is not None:
            if value == current.value:
                return True
            current = current.left if value < current.value else current.right
        return False

    def min_value_node(self, current_node = None):
        if current_node is None:
            current_node = self.root
        while current_node.left is not None:
            current_node = current_node.left
        return current_node

my_tree = BinarySearchTree()
my_tree.insert(61)
print(my_tree.root.value)
my_tree.insert(75)
my_tree.insert(112)
my_tree.insert(4)
my_tree.insert(149)
my_tree.insert(11)
my_tree.insert(71)
print(my_tree.root.left.value)
print(my_tree.root.right.value)
print(my_tree.contains(61))
print(my_tree.contains(144))
print(my_tree.min_value_node().value)
print(my_tree.min_value_node(my_tree.root.right).value)