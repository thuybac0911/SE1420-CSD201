/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileGame;

/**
 *
 * @author nhoxr
 */
public class Gamer implements Comparable<Gamer> {

    //gamer has email and point
    private String email;
    private int point;

    public Gamer() {
    }

    public Gamer(String email, int point) {
	this.email = email;
	this.point = point;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public int getPoint() {
	return point;
    }

    public void setPoint(int point) {
	this.point = point;
    }

    //print info method
    @Override
    public String toString() {
	return "Gamer{" + "email=" + email + ", point=" + point + '}';
    }

//    //use comprareTo method to sort point of user
//    @Override
//    public int compareTo(Gamer user) {
//	if (this.point < user.getPoint()) {
//	    return -1;
//	} else if (this.point > user.getPoint()) {
//	    return 1;
//	}
//	return 0;
//    }
}
