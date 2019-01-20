package ua.od.game.repository.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.BuildingEntity;
import java.util.List;
import ua.od.game.repository.dao.DbTest;
import static org.junit.Assert.*;


public class BuildingDaoImplTest extends DbTest {

    BuildingDaoImpl buildingDao;

    @Before
    public void init() {
        buildingDao = new BuildingDaoImpl();
    }

    @Test
    public void getAllBuildingListTest() {
        List<BuildingEntity> be = buildingDao.getAllBuildingList();
        for (int i = 0; i < be.size(); i++) {
            System.out.print(be.get(i).getId() + " ");
            System.out.print(be.get(i).getName() + " ");
            System.out.print(be.get(i).getDescription()+ " ");
            System.out.print(be.get(i).getDefaultNumber()+ " || ");
            be.get(i).getResourceSetList().forEach(
                    resourceSetEntity -> System.out.print(resourceSetEntity.getResourceId() + " "));
            System.out.println();
        }
        assertFalse(be.isEmpty());
    }
    
}
