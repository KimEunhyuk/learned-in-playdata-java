/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
 * 
 * @author  
 * @version 1.0
*/

package step02.probono.service;

import java.util.ArrayList;
import java.util.Optional;

import step02.probono.exception.ProjectNameDuplicationException;
import step02.probono.exception.ProjectNotFoundException;
import step02.probono.model.dto.Beneficiary;
import step02.probono.model.dto.Donator;
import step02.probono.model.dto.TalentDonationProject;
import step02.probono.view.EndFailView;

public class TalentDonationProjectService {

	private static TalentDonationProjectService instance = new TalentDonationProjectService();

	/** 진행중인 Project를 저장하는 배열 */
	// private TalentDonationProject[] donationProjectList = new TalentDonationProject[10];
	private ArrayList<TalentDonationProject> donationProjectList = new ArrayList<TalentDonationProject>();
	
	/** 진행중인 Project 총 개수 : 배열에 저장시마다 index 값 적용, 저장 후에는 index값을 1씩 증가하는 update 실행 */

	private TalentDonationProjectService() {}

	public static TalentDonationProjectService getInstance() {
		return instance;
	}
	

	/**
	 * 모든 Project 검색
	 * 
	 * @return 모든 Project
	 */
	public ArrayList<TalentDonationProject> getDonationProjectsList() {
		
		return donationProjectList;
	}

	
	// TO DO
	/** 
	 * Project 이름으로 검색 - 객체된 Project 반환하기
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트 
	 */
	//참고 코드 1 - TalentDonationProjectService 
		public TalentDonationProject getDonationProject(String projectName) throws ProjectNotFoundException {

			Optional<TalentDonationProject> project = donationProjectList.stream().filter(v -> v.getTalentDonationProjectName().equals(projectName)).findAny();
			
			if(!project.isPresent()) {
				throw new ProjectNotFoundException("요청하신 project는 존재하지 않습니다");
			};
			
			return project.get();
		}
	
//	public TalentDonationProject getDonationProject(String projectName) throws ProjectNotFoundException {
//		
////		donationProjectList.stream().filter(data -> data.getTalentDonationProjectName().equals(projectName))
////		.forEach(System.out::println);
//		
//		for(TalentDonationProject e : donationProjectList) {
//			if(e.getTalentDonationProjectName().equals(projectName)) {
//				return e;
//				//Arrays.asList(e.getTalentDonationProjectName()).stream().filter(i -> i = projectName).forEach(System.out::println);
//			}
//		}
//		throw new ProjectNotFoundException("요청하신 project는 존재하지 않습니다");
//	}
	

	// TO DO
	/**
	 * 새로운 Project 추가 
	 * 
	 * @param project 저장하고자 하는 새로운 프로젝트
	 */

	public void donationProjectInsert(TalentDonationProject project) throws ProjectNameDuplicationException {
//		int count = 0;
//		count += donationProjectList.stream().filter(data -> data.getTalentDonationProjectName()
//				.equals(project.getTalentDonationProjectName())).count();
//		
//		if(count == 1) {
//			throw new ProjectNameDuplicationException("이미 존재");
//		}else {
//			donationProjectList.add(project);
//		}
		
		
		donationProjectList.stream().filter(v -> v.getTalentDonationProjectName()
				.equals(project.getTalentDonationProjectName())).forEach(System.out::println);
		
		for(TalentDonationProject e : donationProjectList) {
//			Optional<Object> v1 = Optional.ofNullable(null)
			if(e.getTalentDonationProjectName().equals(project.getTalentDonationProjectName())) {
				throw new ProjectNameDuplicationException("이미 존재하는 Project입니다");
			}
		}
		donationProjectList.add(project);
	}

	
	/**
	 * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 기부자 
	 */

	public boolean donationProjectUpdate(String projectName, Donator people) {
		
		for(TalentDonationProject project : donationProjectList) {
			if(project.getTalentDonationProjectName().equals(projectName)) {
				project.setProjectDonator(people);
				return true;	//메소드 자체가 종료
			}
		}
		return false;
	}
	
	//TO DO
	/**
	 * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 수혜자 
	 */
	//? 갱신하고자 하는 프로젝트가 미 존재시 ProjectNotFoundException 발생하기 추가
	/*
	 * 존재하는 프로젝트 인 경우 - 수정 성공
	 * 미존재하는 프로젝트인 경우 - 예외 발생
	 * 
	 * 이 메소드 호출 곳에선 어떻게 성공 여부 확인?
	 * 	- 미 존재할 경우 예외 처리
	 * 	- 예외 발생이 안 될 경우 수정으로 처리
	 */
	public void beneficiaryProjectUpdate(String projectName, Beneficiary people) throws ProjectNotFoundException{

//		Optional<String> opt1 = Optional.ofNullable(projectName);
//		Optional<Beneficiary> opt2 = Optional.ofNullable(people);
//		
//		if(opt1.isPresent() && opt2.isPresent()) {
//			service.setProjectBenyficiary(projectName, people);
//		}
//		else {
//			EndFailView.failView("  ~~~   존재 하지 않습니다.");
//		}
		
		for(TalentDonationProject e : donationProjectList) {
			if(e != null && e.getTalentDonationProjectName().equals(projectName)) {
				e.setProjectBeneficiary(people);
				return; //return 뒤에 반환값이 없음 즉 void인 메소드 자체 종료시 return; 으로 처리하기도함
//				break;
			}
		}
		throw new ProjectNotFoundException("수혜자 정보를 수정하고자 하는 프로젝트가 미 존재합니다.");
	}
	
	
	//TO DO
	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
//	public boolean donationProjectDelete(String projectName) {
//		TalentDonationProject project = null;
//		int count = donationProjectList.size();
//		
//		for(int i=0; i<count; i++) {
//			project = donationProjectList.get(i);
//			
//			if(project.getTalentDonationProjectName().equals(projectName)) {
//				donationProjectList.remove(i);
//				return true;
//			}
//		}
//		return false;
//	}
	public boolean donationProjectDelete(String projectName) {
		TalentDonationProject project = null;
		int count = donationProjectList.size();
		
		for(int i=0; i<count; i++) {
			project = donationProjectList.get(i);
			
			if(project.getTalentDonationProjectName().equals(projectName)) {
				donationProjectList.remove(i);
				return true;
			}
		}
		return false;
	}

	
	/**
	 * 진행중인 Project 총 개수 반환
	 * @return 개수
	 */
	public int projectListSize() {
		return donationProjectList.size();
	}
}
