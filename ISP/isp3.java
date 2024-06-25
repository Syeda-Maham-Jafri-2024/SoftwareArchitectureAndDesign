interface BasicInfo {
    void getBasicInfo();
}

interface SalaryCalculator {
    void calculateSalary();
}

interface PerformanceReviewer {
    void performReview();
}

class BasicEmployee implements BasicInfo {
    public void getBasicInfo() {
        // get basic info
    }
}

class FullTimeEmployee implements BasicInfo, SalaryCalculator, PerformanceReviewer {
    public void getBasicInfo() {
        // get basic info
    }

    public void calculateSalary() {
        // calculate salary
    }

    public void performReview() {
        // perform review
    }
}
