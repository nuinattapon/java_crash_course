package me.nattapon.java.functional;

public class Chapter2Video4v2 {
    protected record Person(String name, Integer age) {
        @Override
        public String toString() {
            return "Person[" +
                    "name:'" + name + '\'' +
                    ", age:" + age +
                    ']';
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::loadPersonFake
                    : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println("Loading person...");
            return new Person("Real Person", 30);
        }

        private Person loadPersonFake() {
            System.out.println("Returning fake person object...");
            return new Person("Fake Person", 100);
        }
    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = false;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());

        NoArgFunction<String> getName = dataLoader.loadPerson.apply()::name;
        System.out.printf("\nThe person name is \"%s\"\n",getName.apply());
    }
}
