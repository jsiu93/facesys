package com.ss.facesys.data.archives.mapper;

import com.ss.facesys.data.archives.common.model.VehicleDiscovery;
import com.ss.facesys.data.archives.common.model.VehicleRecord;
import com.ss.mapper.SsMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface ArchivesVehicleDiscoveryMapper extends SsMapper<VehicleDiscovery> {
  String getDiscoveryDetailId(VehicleDiscovery paramVehicleDiscovery);
  
  void updateDiscoveryFirstMaster(List<VehicleDiscovery> paramList);
  
  void updateDiscoveryFirstSlave(List<VehicleDiscovery> paramList);
  
  void updateDiscoveryThirdMaster(List<VehicleDiscovery> paramList);
  
  void insertsDiscoveryThirdSlave(List<VehicleDiscovery> paramList);
  
  void insertsDiscovery(List<VehicleRecord> paramList);
  
  void insertsDiscoveryRecordSlave(List<VehicleRecord> paramList);
  
  void updateDiscoveryByFlag(List<VehicleDiscovery> paramList);
  
  void updateVehicle(List<VehicleRecord> paramList);
}
