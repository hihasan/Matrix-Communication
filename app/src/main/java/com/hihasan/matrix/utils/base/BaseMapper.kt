package com.hihasan.matrix.utils.base

interface BaseMapper <ENTITY, DTO> {
    fun mapFromDtoToEntity(dto: DTO) : ENTITY
    fun fromDtoToEntity(initial: List<DTO>): List<ENTITY>
}