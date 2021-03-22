package example.notes;

import java.util.Date;

public class Note {
    private Date dateOfCreation;
    private String titleNote;
    private String note;

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public String getNote() {
        return note;
    }
}
