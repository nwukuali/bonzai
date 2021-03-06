package za.ac.nwu.bonsai.businessobject;

public enum LeaveType {

	ANNUAL("Annual", 1),
	SICK("Sick", 2),
	FAMILY_RESPONSIBILITY("Family Responsibility", 3),
	STUDY("Study", 4),
    ACCUMULATED("Accumulated", 5);

	LeaveType(String name, int priority){
		this.name = name;
		this.priority = priority;
	}

	private String name;
	private final int priority;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public static LeaveType toLeaveType(String name){
        for (LeaveType leaveType : values()){
            if (leaveType.name().equalsIgnoreCase(name)){
                return leaveType;
            }
        }
        return null;
    }


}
