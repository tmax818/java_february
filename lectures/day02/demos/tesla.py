
class Tesla:
    
    def __init__(self, color, doors = 4) -> None:
        self.color = color
        self.__doors = doors
        
    def drive(self):
        print(f"I am driving my {self.color}")
        
    # @property
    # def doors(self):
    #     return self.__doors
    
    # @doors.setter
    # def doors(self, doors):
    #     self.__doors = doors