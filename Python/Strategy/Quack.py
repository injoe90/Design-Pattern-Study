from abc import *


class QuackBehavior(metaclass=ABCMeta):
    @abstractmethod
    def quack(self):
        pass


class Quack(QuackBehavior):
    def quack(self):
        print("꽥!")


class Squeak(QuackBehavior):
    def quack(self):
        print("삑!")


class MuteQuack(QuackBehavior):
    def quack(self):
        print("<< 조용~ >>")