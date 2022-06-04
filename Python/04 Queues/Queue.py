class Node:
    def __init__(self, value):
        self.value = value
        self.prev = None

class Queue:
    def __init__(self, value):
        new_node = Node(value)
        self.first = new_node
        self.last = new_node
        self.length = 1

    def print_queue(self):
        tmp = self.first
        while tmp is not None:
            print(tmp.value)
            tmp = tmp.prev

    def enqueue(self, value):
        new_node = Node(value)
        if self.length == 0:
            self.first = self.last = new_node
        else:    
            self.last.prev = new_node
            self.last = new_node
        self.length += 1

    def dequeue(self):
        if self.length == 0:
            return None
        tmp = self.first   
        if self.length == 1:
            self.first = self.last = None
        else:
            self.first = self.first.prev
            tmp.prev = None
        self.length -= 1
        return tmp

my_queue = Queue(4)
my_queue.enqueue(16)
my_queue.print_queue()
print("dequeued: ", my_queue.dequeue().value)
my_queue.print_queue()