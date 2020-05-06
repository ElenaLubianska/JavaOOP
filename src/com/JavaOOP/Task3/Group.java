package com.JavaOOP.Task3;

public class Group {
    private Student[] group = new Student[10];
    private String groupName;

    public Group() {
        super();
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student){
        for( int i = 0; i < group.length; i++){
            if(group[i] == null) {

                group[i] = student;
                return;
            }
        }

    }

    public boolean deleteStudent(String surname){
        for(int i = 0; i < group.length; i++){
            if(group[i] != null && group[i].getSurname() == surname){
                group[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student seach(String surname){
        for (Student student: group) {
            if(student != null && student.getSurname().equals(surname)){
                return student;
            }
        }
        return null;
    }
    private void sort(){
        for(int i = 0; i < group.length; i++){
            for( int j = 0; j < group.length; j++ ){
                if( compareStudent(group[i], group[j]) > 0){
                    Student tmp = group[i];
                    group[i] = group[j];
                    group[j] = tmp;
                }
            }
        }
    }
    private int compareStudent(Student a, Student b){
        if(a != null && b == null){
            return 1;
        }
        if(a == null && b != null){
            return -1;
        }
        if(a == null && b == null){
            return 0;
        }
        return a.getSurname().compareTo(b.getSurname());
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Group: " + this.groupName).append(System.lineSeparator());
       int i = 0;
       sort();
       for (Student student : group){
           if (student != null){
               sb.append ((++i) + ") ").append(student);
               sb.append(System.lineSeparator());
           }
       }
       return sb.toString();
    }
}
