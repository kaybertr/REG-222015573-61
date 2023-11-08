interface GovernmentBody {
    public void governmentMission();
}

class Government implements GovernmentBody {
    public void governmentMission() {
        System.out.println("Our Mission is to govern the country and protect its citizens");
    }
}

class President extends Government {
    public void presidentDuties() {
        System.out.println("The President leads the executive branch and is the commander-in-chief of the armed forces.");
    }
}

class Senator extends Government {
    public void senatorDuties() {
        System.out.println("Senators represent the interests of their constituents and make laws.");
    }
}

class Representative extends Government {
    public void representativeDuties() {
        System.out.println("Representatives represent the interests of their constituents and make laws.");
    }
}

class SupremeCourtJustice extends Government {
    public void supremeCourtJusticeDuties() {
        System.out.println("Supreme Court Justices interpret the Constitution and make decisions that affect the laws of the land.");
    }
}

class AttorneyGeneral extends Government {
    public void attorneyGeneralDuties() {
        System.out.println("The Attorney General is the chief legal officer of the government and represents the United States in court.");
    }
}

class FederalJudge extends Government {
    public void federalJudgeDuties() {
        System.out.println("Federal Judges preside over trials and hear appeals in federal courts.");
    }
}

class GovernmentHierarchy {
    public static void main(String[] args) {
        SupremeCourtJustice justice = new SupremeCourtJustice();
        justice.supremeCourtJusticeDuties();
        justice.governmentMission();

        AttorneyGeneral ag = new AttorneyGeneral();
        ag.attorneyGeneralDuties();
        ag.governmentMission();

        FederalJudge judge = new FederalJudge();
        judge.federalJudgeDuties();
        judge.governmentMission();
    }
}
