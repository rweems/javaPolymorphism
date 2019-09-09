class AnimalPolymorphism {

    String food;
    int fullness = 0;


    public String makeNoise() {
        String noise = "animal noise";

        return noise;
    }//end makenoise

    public String eat() {
        fullness++;
        String eaten = "I have eaten";
        return (eaten + makeNoise());
    }// end eat

    public String roam() {
        String toRoam;
        if (fullness > 0) {
            fullness--;
            toRoam = "Time to search";
        } else {
            toRoam = "Too hungry to roam";
        }

        return toRoam;
    }// end roam
}// end class

class Cat extends AnimalPolymorphism {
    String noise;

    public String makeNoise() {
        if (fullness > 10) {
            noise = "ZZZ!";
        } else if (fullness < 7 && fullness > 4) {
            noise = "Im a bored cat";
        } else {
            noise = "Im hungry, MEOW";
        }
        return noise;
    }// end makenoise


} // end Cat class

class Dog extends AnimalPolymorphism {
    String noise;

    public String makeNoise() {
        if (fullness > 10) {
            noise = "ZZZ!";
        } else if (fullness < 7 && fullness >= 2) {
            noise = "Im a bored dog";
        } else {
            noise = "Im hungry, ROOF";
        }
        return noise;
    } //end makenoise
} // end Dog class

class AnimalTestDrive {
    public static void main(String[] args) {
        AnimalPolymorphism d = new Dog();
        AnimalPolymorphism c = new Cat();

        System.out.println(c.makeNoise());

        d.eat();
        d.eat();
        System.out.println(d.makeNoise());
    }// end main
}// end test drive class
