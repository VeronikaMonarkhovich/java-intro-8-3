package com.taory.pharmacy;

public class Medicine {

    String nameMedicine; //название препарата
    boolean prescriptionDrug; // рецептурный препарат или нет
    String pharmaceuticalGroup; // фармацевтическая группа препарата

    public Medicine(String nameMedicine, boolean prescriptionDrug, String pharmaceuticalGroup) {
        this.nameMedicine = nameMedicine;
        this.prescriptionDrug = prescriptionDrug;
        this.pharmaceuticalGroup = pharmaceuticalGroup;
    }

    public boolean isPrescriptionDrug() {
        return prescriptionDrug;
    }
}