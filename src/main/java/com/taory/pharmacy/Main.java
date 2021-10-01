package com.taory.pharmacy;

public class Main {

    public static void main(String[] args) {
        Medicine[] sold1 = new Medicine[5]; // массив проданых препаратов за 1 день
        Medicine[] sold2 = new Medicine[6]; // массив проданых препаратов за 2 день

        sold1[0] = new Medicine("Aspirine", false, "analgesics");
        sold1[1] = new Medicine("Sonex", true, "hypnotic");
        sold1[2] = new Medicine("Smekta", false, "adsorbent");
        sold1[3] = new Medicine("Omez", false, "proton pump blocker");
        sold1[4] = new Medicine("Pozitiva", true, "antidepressant");

        sold2[0] = new Medicine("Paracetamol", false, "analgesics");
        sold2[1] = new Medicine("Mirzaten", true, "antidepressant");
        sold2[2] = new Medicine("Valeriane", false, "sedative");
        sold2[3] = new Medicine("Nolpaza", false, "proton pump blocker");
        sold2[4] = new Medicine("Xarelto", true, "anti-thrombotic");
        sold2[5] = new Medicine("Sumamed", true, "antibiotic");
        // создаем 2 рабочих дня
        LaborDay day1 = new LaborDay("3 september", sold1);
        LaborDay day2 = new LaborDay("4 september", sold2);

        day1.printCountPrescriptionDrugs();
        day2.printCountPrescriptionDrugs();
    }
}