package entities;

public class Room {
    private boolean vacant = true;
    private CollegeStudent currentStudent;

    public CollegeStudent getCurrentStudent() {
        return this.currentStudent;
    }

    public boolean getVacant() {
        return this.vacant;
    }

    public void rent(CollegeStudent newPatron, int roomNumber) {
        if(roomNumber >= 0 && roomNumber < 10) {
            this.currentStudent = newPatron;
            this.vacant = false;
        }
    }

    public void info(Room[] pensionato) {
        for(int i = 0; i < pensionato.length; i++) {
            if(!pensionato[i].getVacant()) {
                System.out.println(i + ": " + pensionato[i].getCurrentStudent().getName() + ", " + pensionato[i].getCurrentStudent().getEmail());
            }
        }
    }
}
