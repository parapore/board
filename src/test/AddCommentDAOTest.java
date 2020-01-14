package test;

import org.junit.jupiter.api.Test;

import model.AddCommentDAO;
import model.Board;

class AddCommentDAOTest {

	@Test
	void 空文字を入力するテスト() {
		Board bo = new Board();
		bo.setName("");
		bo.setComment("");
		AddCommentDAO acdao = new AddCommentDAO(bo);
	}

}
