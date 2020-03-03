package com.accp.paimai.pojo;

public class User {
    private Integer userid;

    private String username;

    private String userpwd;

    private Integer power;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

	public User(String username, String userpwd, Integer power) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.power = power;
	}

	public User(Integer userid, String username, String userpwd, Integer power) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.power = power;
	}

	public User() {
		super();
	}
    
    
}