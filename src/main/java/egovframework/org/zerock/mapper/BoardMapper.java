package egovframework.org.zerock.mapper;

import java.util.List;

import egovframework.org.zerock.domain.BoardVO;
import egovframework.org.zerock.domain.Criteria;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);
}
