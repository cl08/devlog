package com.ssafy.devlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.devlog.dto.Project;
import com.ssafy.devlog.mapper.ProjectMapper;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public int selectProjectCntByFeed(int seq_user, int disclosure, List<String> tag) {
		return projectMapper.selectProjectCntByFeed(seq_user, disclosure, tag);
	}
	
	@Override
	public List<Project> selectProjectByFeed(int seq_user,int disclosure,int offset,int limit,List<String> tag){
		return projectMapper.selectProjectByFeed(seq_user, disclosure, offset, limit, tag);
	}

	@Override
	public int selectProjectCntByBlog(int seq_user, int disclosure, List<String> tag) {
		return projectMapper.selectProjectCntByBlog(seq_user, disclosure, tag);
	}

	@Override
	public List<Project> selectProjectByBlog(int seq_user,int disclosure,int offset,int limit,List<String> tag){
		return projectMapper.selectProjectByBlog(seq_user, disclosure, offset, limit, tag);
	}

	
	@Override
	public Project selectProject(int seq){
		return projectMapper.selectProject(seq);
	}
	
	@Override
	public int insertPost(Project project){
		return projectMapper.insertPost(project);
	}
	
	@Override
	public int insertPostProject(Project project){
		return projectMapper.insertPostProject(project);
	}
	
	@Override
	public int updatePost(Project project){
		return projectMapper.updatePost(project);
	}
	
	@Override
	public int updatePostProject(Project project) {
		return projectMapper.updatePostProject(project);
	}
	
	@Override
	public int deleteProject(int seq){
		return projectMapper.deleteProject(seq);
	}

}
