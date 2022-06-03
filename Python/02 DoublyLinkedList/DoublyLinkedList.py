class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self, value):
        new_node = Node(value)
        self.head = self.tail = new_node
        self.length = 1

    def print_list(self):
        tmp = self.head
        for _ in range(self.length):
            while tmp:
                print(tmp.value)
                tmp = tmp.next

    def append(self, value):
        new_node = Node(value)
        if self.length == 0:
            self.head = self.tail = new_node
        else:
            new_node.prev = self.tail
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        return True

    def pop(self):
        if self.length == 0:
            return None
        elif self.length == 1:
            tmp = self.head
            self.head = self.tail = None
            self.length = 0
            return tmp
        else:
            tmp = self.tail
            self.tail = self.tail.prev
            self.tail.next = None
            tmp.prev = None
            self.length -= 1
            return tmp

    def prepend(self, value):
        new_node = Node(value)
        if self.length == 0:
            self.head = self.tail = new_node
            self.length = 1
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node
            self.length += 1
        return True

    def pop_first(self):
        if self.length == 0:
            return None
        tmp = self.head
        if self.length == 1:
            self.head = self.tail = None
        else:
            self.head = self.head.next
            self.head.prev = None
            tmp.next = None
        self.length -= 1
        return tmp

    def get(self, index):
        if (index < 0) or (index+1 > self.length):
            return None
        else:
            tmp = self.head
            for _ in range(index):
                tmp = tmp.next
            return tmp

    def set_value(self, index, value):
        tmp = self.get(index)
        if tmp:
            tmp.value = value
            return True
        else:
            return Flase

    def insert(self, index, value):
        # incomplete untested
        # if (index<0) or (index+1>self.length):
        #     return False
        # elif index == 0:
        #     return self.prepend(value)
        # else:
        #     new_node = Node(value)
        #     tmp = self.get(index)
        #     new_node.prev = tmp.prev
        #     new_node.next = tmp
        #     tmp.prev.next = new_node
        #     tmp.prev = new_node
        #     self.length += 1
        #     return True
        if (index < 0) or (index > self.length):
            return False
        if index == 0:
            return self.prepend(value)
        if index == self.length:
            return self.append(value)

        new_node = Node(value)
        after = self.get(index)
        before = after.prev
        new_node.prev = before
        new_node.next = after 
        before.next = new_node
        after.prev = new_node
            
        self.length += 1
        return True

    def remove(self, index):
        if (index < 0) or (index >= self.length):
            return None
        if index == 0:
            return self.pop_first()
        if index == self.length-1:
            return self.pop()

        node = self.get(index)
        node.prev.next = node.next
        node.next.prev = node.prev
        node.next = node.prev = None

        self.length -= 1
        return node


my_doubly_linked_list = DoublyLinkedList(61)
my_doubly_linked_list.append(14)
# print("popped first: ", my_doubly_linked_list.pop_first().value)
my_doubly_linked_list.append(75)
my_doubly_linked_list.print_list()
print("popped: ", my_doubly_linked_list.pop().value)
my_doubly_linked_list.prepend(75)
print(my_doubly_linked_list.length)
print("list:")
my_doubly_linked_list.print_list()
print(my_doubly_linked_list.insert(3, 256))
print("list:")
my_doubly_linked_list.remove(1)
my_doubly_linked_list.print_list()
# print("value at index 1 =",my_doubly_linked_list.get(1).value)