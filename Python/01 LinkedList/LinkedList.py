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
            
    def get(self, index):
        # returns the value at the index
        if (index+1 > self.length) or (index < 0):
            return None
        elif index+1 == self.length:
            return self.tail
        else:
            tmp = self.head
            for _ in range(index):
                tmp = tmp.next
            return tmp

    def set_value(self, index, value):
        # if (index+1 > self.length) or (index < 0):
        #     return None
        # elif index+1 == self.length:
        #     self.tail.value = value
        # else:
        #     tmp = self.head
        #     for _ in range(index):
        #         tmp = tmp.next
        #     tmp.value = value

        # Better use get() to get the node
        tmp = self.get(index)
        if tmp is not None:
            tmp.value = value
            return True
        return False

    def insert(self, index, value):
        if index==0:
            return self.prepend(value)
        elif index+1==self.length:
            return self.append(value)
        else:
            new_node = Node(value)
            tmp = self.get(index-1)
            if tmp:
                new_node.next = tmp.next
                tmp.next = new_node
                self.length += 1
                return True
            return False

    def remove(self, index):
        if index==0:
            return self.pop_first()
        elif index+1==self.length:
            return self.pop()
        else:
            tmp = self.get(index-1)
            if tmp:
                toPop = tmp.next
                tmp.next = toPop.next
                toPop.next = None
                self.length -= 1
                return toPop
            return None
    
    def reverse(self):
        # TODO


my_linked_list = LinkedList(14)

my_linked_list.append(75)
my_linked_list.append(61)
my_linked_list.insert(1, 22)
my_linked_list.insert(90, 122)
my_linked_list.print_list()
print("value at index 0: ", my_linked_list.get(0).value)
print("value at index 2: ", my_linked_list.get(2).value)
my_linked_list.set_value(2, 11)
print("value at index 2: ", my_linked_list.get(2).value)
# print("value at index 5: ", my_linked_list.get(5))
# print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
# print("popping: ", my_linked_list.pop().value)
# my_linked_list.print_list()
# print("Prepending ", 101)
# my_linked_list.prepend(101)
# my_linked_list.print_list()
# print("popping first:", my_linked_list.pop_first().value)
# print(my_linked_list.pop_first().value, "Popped <-")
# print(my_linked_list.pop_first().value, "Popped <-")
# print(my_linked_list.pop_first().value, "Popped <-")
print("removing: ", my_linked_list.remove(1).value)
my_linked_list.print_list()