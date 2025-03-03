package com.icet.crm.service;

import com.icet.crm.dto.RepairDto;

import java.util.List;

public interface RepairService {
    boolean addRepair(RepairDto repairDto);
    RepairDto findReapairById(Integer id);
    boolean deleteRepair(Integer id);
    boolean updateRepair(RepairDto repairDto);
    List<RepairDto> getAll();
    List<RepairDto> findRepairsByType(String type);
    RepairDto findByType(String type);
}
