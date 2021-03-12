package com.ltts.model;

public class Team {

	private String teamName;
	private int teamId;
	private String teamOwner;
	
	private String teamCaptain;
	
	
	
	public Team() {
		super();
	}
	public Team(String teamName,int teamId,String teamOwner, String teamCaption) {
		super();
		this.teamName = teamName;
		this.teamOwner = teamOwner;
		this.teamId = teamId;
		this.teamCaptain = teamCaption;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamOwner() {
		return teamOwner;
	}
	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamCaptain() {
		return teamCaptain;
	}
	
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamOwner=" + teamOwner + ", teamId=" + teamId + ", teamCaptain="
				+ teamCaptain + "]";
	}


}