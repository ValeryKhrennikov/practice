package org.example.patterns.adapter;

public class AdapterExample {
    public interface USB {

        void connectWithUsbCable();
    }
    public static class MemoryCard {

        public void insert() {
            System.out.println("Карта памяти успешно вставлена!");
        }

        public void copyData() {
            System.out.println("Данные скопированы на компьютер!");
        }
    }
    public static class CardReader implements USB {


        public CardReader(MemoryCard memoryCard) {
            this.memoryCard = memoryCard;
        }

        @Override
        public void connectWithUsbCable() {
            this.memoryCard.insert();
            this.memoryCard.copyData();
        }
    }
    public static void main(String[] args) {

        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();

    }

}

