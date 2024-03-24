package com.brayan.a2433.service;
import com.brayan.a2433.domain.Community;
public class CommunityService {
    @Override
    public List<community>findAll(){
        ArrayList<Community>list = new ArrayList<Community>();
        Community community=new Community();
        community.setId(121);
        community.setName("heima");
        list.add(community);
        return list;

}
