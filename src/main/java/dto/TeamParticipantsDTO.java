package dto;

public class TeamParticipantsDTO {
    private String team_id;
    private int numberOfParticipants;

    public TeamParticipantsDTO(String team_id, int numberOfParticipants) {
        this.team_id = team_id;
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getTeam_id() {
        return team_id;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    @Override
    public String toString() {
        return "team_id  =" + team_id + " | numberOfParticipants=  " + numberOfParticipants;
    }
}
