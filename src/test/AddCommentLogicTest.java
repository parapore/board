package test;

import org.junit.jupiter.api.Test;

import model.AddCommentLogic;
import model.Board;

class AddCommentLogicTest {

	@Test
	void testExecuteAddComment() {
		Board bo = new Board();
		bo.setName("アッドコメントロジックテスト");
		bo.setComment("コメント");
		AddCommentLogic acl = new AddCommentLogic();
		acl.executeAddComment(bo);
	}
}
