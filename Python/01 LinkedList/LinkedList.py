class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self, value):
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1

    def print_list(self):
        current = self.head
        while current is not None:
            print(current.value)
            current = current.next

    def append(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        return True

    def prepend(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        self.length += 1
        return True
        
    def pop(self):
        if self.length == 0:
            return None
        elif self.head == self.tail:
            tmp = self.head
            self.head = self.tail = None
            self.length = 0
            return tmp
        else:
            pre = self.head
            post = self.head
            while post.next is not None:
                pre = post
                post = post.next
            self.tail = pre
            pre.next = None
            self.length -= 1
            return post

    def pop_first(self):
        if self.head == None:
            return None
        elif self.head == self.tail:
            tmp = self.head
            self.head = self.tail = None
            self.length -= 1
            return tmp
        else:
            tmp = self.head
            self.head = self.head.next
            self.length -= 1
            tmp.next = None
            return tmp
        
    
    


my_linked_list = LinkedList(14)

my_linked_list.append(75)
my_linked_list.append(61)
my_linked_list.print_list()
print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
my_linked_list.print_list()
print("Prepending ", 101)
my_linked_list.prepend(101)
my_linked_list.print_list()
print("popping first:", my_linked_list.pop_first().value)
# print(my_linked_list.pop_first().value, "Popped <-")
# print(my_linked_list.pop_first().value, "Popped <-")
# print(my_linked_list.pop_first().value, "Popped <-")
my_linked_list.print_list()