class Node:
    def __init__(self, value):
        self.value = value
        self.prev = None

class Stack:
    def __init__(self, value):
        new_node = Node(value)
        self.height = 1
        self.top = new_node

    def print_stack(self):
        tmp = self.top
        while tmp is not None:
            print(tmp.value)
            tmp = tmp.prev

    def push(self, value):
        new_node = Node(value)
        new_node.prev = self.top
        self.top = new_node
        self.height += 1

    def pop(self):
        if self.height == 0:
            return None
        tmp = self.top
        self.top = tmp.prev
        tmp.prev = None
        self.height -= 1
        return tmp
        

my_stack = Stack(12)
my_stack.push(14215)
my_stack.push(124)
my_stack.pop()
my_stack.print_stack()