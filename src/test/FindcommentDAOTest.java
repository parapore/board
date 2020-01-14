package test;

import org.junit.jupiter.api.Test;

import model.FindCommentDAO;

class FindcommentDAOTest {

	@Test
	void testFindcomment() {
		FindCommentDAO fcdao = new FindCommentDAO();
		fcdao.findcomment();
	}

}
