package com.taory.pharmacy;

public class LaborDay {

    String date; // дата
    Medicine[] sold; // массив проданных препаратов

    public LaborDay(String date, Medicine[] sold) {
        this.date = date;
        this.sold = sold;
    }

    //выведем количество проданных рецептурных препаратов за день
    public void printCountPrescriptionDrugs() {
        int countPrescriptionDay = 0;
        for (Medicine medicine : this.sold) {
            if (medicine.isPrescriptionDrug()) {
                countPrescriptionDay++;
            }
        }
        System.out.println(this.date + " : sold count of prescription drug: " + countPrescriptionDay);
    }
}


