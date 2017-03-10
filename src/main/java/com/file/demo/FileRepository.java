package com.file.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

@Component
@RepositoryRestResource
public interface FileRepository extends CrudRepository<FileDetail, Long> {
	
	public List<FileDetail> findByFileName(String fileName);
	public List<FileDetail> findByFileNameAndName(String fileName, String name);
	public List<FileDetail> findByName(String name);
}
