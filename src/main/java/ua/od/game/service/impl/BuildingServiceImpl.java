package ua.od.game.service.impl;

import ua.od.game.dto.BuildingDto;
import ua.od.game.dto.ResourceSetDto;
import ua.od.game.model.BuildingEntity;
import ua.od.game.repository.dao.BuildingDao;
import ua.od.game.service.BuildingService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class BuildingServiceImpl implements BuildingService {

    @Inject
    public BuildingDao buildingDao;

    @Override
    public List<BuildingDto> getAllBuildingList() {
        final List<BuildingDto> buildings = new ArrayList<>();
        buildingDao.getAllBuildingList().forEach(buildingEntity -> buildings.add(new BuildingDto() {{
            setId(buildingEntity.getId());
            setName(buildingEntity.getName());
            setDescription(buildingEntity.getDescription());
            setDefaultNumber(buildingEntity.getDefaultNumber());
            setResourceSetList(getRSList(buildingEntity));
        }}));
        return buildings;
    }

    private List<ResourceSetDto> getRSList(BuildingEntity buildingEntity) {
        List<ResourceSetDto> rsList = new ArrayList<>();
        buildingEntity.getResourceSetList().forEach(resourceSetEntity -> rsList.add(new ResourceSetDto() {{
            setId(resourceSetEntity.getId());
            setSetId(resourceSetEntity.getSetId());
            setResourceId(resourceSetEntity.getResourceId());
            setAmount(resourceSetEntity.getAmount());
        }}));
        return rsList;
    }
}
